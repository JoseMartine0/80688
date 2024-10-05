const app = document.getElementById("app")
const fieldset = (p1, p2, p3, id1, id2) => {
        return`<fieldset>
        <legend>${p1}</legend>
        <label for="">${p2}</label>
        <input type="text" id="${id1}" required>
        <label for="${id2}">${p3}</label>
        <input type="text" id="${id2}" required>
        
    </fieldset>
    `


}

app.innerHTML = fieldset("soy yo", "nombre", "Correo electronico", "direccion")