
            var events=[];
            
            function addEvent(){
                var event = document.getElementById('input1').value;
                console.log(event);
                if(events.length===0){
                    events.push(event);
                    document.getElementById('successMessage').innerHTML="Successfully entered";
                    document.getElementById('successMessage').style.color="green";
                    document.getElementById('successMessage').style.textAlign="center";
                    console.log(events)
                }
                else{
                    isPresent=true;
                    console.log("in else part");
                    for(i=0;i<events.length;i++){
                        if(events[i]===event){
                           isPresent=false;
                           console.log("in for loop");
                        }
                    }
                    if(isPresent===true){
                        events.push(event);
                        document.getElementById('successMessage').innerHTML="Successfully entered";
                        document.getElementById('successMessage').style.color="green";
                        document.getElementById('successMessage').style.textAlign="center";
                        console.log(events);
                    }
                    else{
                        document.getElementById('successMessage').innerHTML="Enter a different Name";
                        document.getElementById('successMessage').style.color="red";
                        document.getElementById('successMessage').style.textAlign="center";
                    }
                }
            }
            function display(){
            events.sort();
            var result="";
            events.forEach(function(event){
                result=result+'<li>'+event;
            });
            document.getElementById("resultList").innerHTML=result;
            }
            