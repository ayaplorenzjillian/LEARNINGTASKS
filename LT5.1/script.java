/*eslint-env browser*/
function talkid(obj) {
  //alert(obj.id);
    if (obj.id === 'block-4') {
        const myElement = document.getElementById('sasha-talk');
            myElement.style.display = "block";
    } else if (obj.id === 'block-1'){
         const myElement = document.getElementById('dana-talk');
            myElement.style.display = "block";       
    } else if (obj.id === 'block-5'){
         const myElement = document.getElementById('jade-talk');
            myElement.style.display = "block";
    } else if (obj.id === 'block-3'){
         const myElement = document.getElementById('yasmin-talk');
            myElement.style.display = "block";
    } else if (obj.id === 'block-2'){
         const myElement = document.getElementById('cloe-talk');
            myElement.style.display = "block";
}
}

function hideid(obj) {
  //alert(obj.id);
    if (obj.id === 'block-4') {
        const myElement = document.getElementById('sasha-talk');
            myElement.style.display = "none";
    } else if (obj.id === 'block-1') {
        const myElement = document.getElementById('dana-talk');
            myElement.style.display = "none";
    } else if (obj.id === 'block-5') {
        const myElement = document.getElementById('jade-talk');
            myElement.style.display = "none";
    } else if (obj.id === 'block-3') {
        const myElement = document.getElementById('yasmin-talk');
            myElement.style.display = "none";
    } else if (obj.id === 'block-2') {
        const myElement = document.getElementById('cloe-talk');
            myElement.style.display = "none";
}
}