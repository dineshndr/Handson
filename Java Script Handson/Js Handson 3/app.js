var events=[];
const pushbutton=document.querySelector("#btn1");
const popbutton=document.querySelector("#btn2");
const displaybutton=document.querySelector("#btn3");

function addEvent(){
    var event = document.getElementById('input1').value;
    console.log(event);
    if(events.length===0){
        events.push(event);
        document.getElementById('successMessage').innerHTML="Sucessfully entered";
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
            document.getElementById('successMessage').innerHTML="Sucessfully entered";
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

function popEvent(){
    events.pop();
    document.getElementById('successMessage').innerHTML="Sucessfully entered";
    document.getElementById('successMessage').style.color="green";
}

function display(){

events.sort();
var result= '<h3>The Events in The Array After Sorting</h3>';
events.forEach(function(event){
    result+='<li>'+event;
});
document.getElementById("resultList").innerHTML=result;
}

pushbutton.addEventListener('click',addEvent);
popbutton.addEventListener('click',popEvent);
displaybutton.addEventListener('click',display);