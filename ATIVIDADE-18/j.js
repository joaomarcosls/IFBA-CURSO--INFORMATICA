function validacao() {
    var formulario = document.getElementById("cliente");

    var nome = document.getElementById("nome");
    var cidade = document.getElementById("cidade");
    var log = document.getElementById("log");
    var senha = document.getElementById("senha");
    var senha1 = document.getElementById("senha1");
    if (nome.value === "") {
        alert("Campo Obrigatório não preenchido!");
    } else {
        if (log.value === "") {
            alert("Campo Obrigatório não preenchido!");
        } else {
            if (senha.value === "") {
                alert("Campo Obrigatório não preenchido!");
            } else {
                if (senha1.value === "") {
                    alert("Campo Obrigatório não preenchido!");
                } else {
                    alert("Cadastro completo!!");
                    formulario.submit();
                }
            }
        }

    }
}



