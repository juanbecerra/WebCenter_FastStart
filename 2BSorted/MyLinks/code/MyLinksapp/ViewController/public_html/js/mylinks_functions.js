     function getparentURL()
     {
      var input1 = document.getElementById('r1:1:it1::content');    
      v_url=parent.location.href;
      if (v_url.indexOf('?')>0)
      {
        input1.value= v_url.substr(0,v_url.indexOf('?'));

      }
      else
      {
        input1.value=parent.location.href;
      }
      
     }
     