const contenidoTelefonos = document.querySelector(".contenido_telefonos");
let productos = [];
//Guardando los productos

let longitud = contenidoTelefonos.children.length;
for(let i=0; i<longitud; i++){
    productos= [...productos,contenidoTelefonos.children[i].innerHTML]
}
console.log("Hola");
/*Mis eventos*/

const inputBusqueda = document.querySelector('#id_buscador');

inputBusqueda.addEventListener('keyup', ()=>{
    buscarProducto(inputBusqueda.value);
})


/*Mis Funciones*/


function buscarProducto(textoBuscar){
    reinisializar();
    let cantidadExistente = longitud;
    for(let i=0; i<longitud; i++){
        cantidadExistente = depurarBusqueda(cantidadExistente-longitud,textoBuscar,cantidadExistente);
    }
    if(contenidoTelefonos.children.length===0){
        let divImagenError = document.createElement("div");
        divImagenError.classList.add("caja_img_sin_resultados");
        contenidoTelefonos.appendChild(divImagenError);

        let imagenError = document.createElement("img");
        imagenError.classList.add("img_sin_resultados");
        imagenError.src= "img/sinResultados.png";
        divImagenError.appendChild(imagenError);
    }
}

function depurarBusqueda(posicion,textoBuscar,cantidadExistente){
    let nombreProductoBuscar = contenidoTelefonos.children[posicion].children[1].children[0].textContent;
    if(nombreProductoBuscar.includes(textoBuscar)){
        cantidadExistente++;
    }else{
        contenidoTelefonos.children[posicion].remove();
    }
    return cantidadExistente;
}

function reinisializar(){
    limpiarBusqueda();
    for(let i =0; i<productos.length; i++){
        recrearElementos(productos[i]);
    }
}

function limpiarBusqueda(){
    let longitudProductosBusqueda = contenidoTelefonos.children.length;
    for(let i =0; i<longitudProductosBusqueda; i++){
        contenidoTelefonos.children[0].remove();
    }
}

function recrearElementos(htmlDefecto){
    let cajaContenido = document.createElement("div");
    cajaContenido.classList.add("caja_telefono");
    cajaContenido.innerHTML =  htmlDefecto;
    contenidoTelefonos.appendChild(cajaContenido);
}
