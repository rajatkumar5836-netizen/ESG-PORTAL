function calculateESG() {

    let env = document.getElementById("env").value;
    let soc = document.getElementById("soc").value;
    let gov = document.getElementById("gov").value;

    if(env === "" || soc === "" || gov === "") {
        document.getElementById("result").innerText = "Please enter all values!";
        return;
    }

    let total = (parseFloat(env) + parseFloat(soc) + parseFloat(gov)) / 3;

    let grade = "";

    if(total >= 80) {
        grade = "Excellent 🌟";
    } else if(total >= 50) {
        grade = "Good 👍";
    } else {
        grade = "Needs Improvement ⚠️";
    }

    document.getElementById("result").innerText =
        "Average ESG Score: " + total.toFixed(2) + " (" + grade + ")";
}