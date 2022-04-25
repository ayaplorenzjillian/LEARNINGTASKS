function talkid(obj) {
    if (obj.id === 'bratz-1') {
       const myElement = document.getElementById('cloe-talk');
            myElement.style.display = "block";
}  else if (obj.id === 'bratz-2'){
         const myElement = document.getElementById('sasha-talk');
            myElement.style.display = "block";       
}  else if (obj.id === 'bratz-3'){
        const myElement = document.getElementById('yasmin-talk');
            myElement.style.display = "block";
    }
}

function hideid(obj) {
   if (obj.id === 'bratz-1') {
        const myElement = document.getElementById('cloe-talk');
            myElement.style.display = "none";
 } else if (obj.id === 'bratz-2') {
        const myElement = document.getElementById('sasha-talk');
            myElement.style.display = "none";
 } else if (obj.id === 'bratz-3'){
        const myElement = document.getElementById('yasmin-talk');
            myElement.style.display = "none";
    }
}