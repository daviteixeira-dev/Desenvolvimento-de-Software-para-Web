
function Data() {
    document.getElementById('resultado').innerHTML = Date();
}

function Somar(){
    var n1 = document.getElementById('n1').value;
    var n2 = document.getElementById('n2').value;
    var res = Number(n1) + Number(n2);
    document.getElementById('resultado').innerHTML = " O valor da soma é: " + res;
}