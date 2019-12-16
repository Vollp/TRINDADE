import crypto from "crypto";


class Security {

    encriptar(pssw) {
        const DADOS = {
            algoritmo: 'aes256',
            segredo: 'keys',
            tipo: 'hex'
        };

        const cipher = crypto.createCipher(DADOS.algoritmo, DADOS.segredo);
        cipher.update(pssw);
        return cipher.final(DADOS.tipo);
    };

    validarSenhas(pssw, cPssw, id) {
        let newPssw = [];
        let confirmPssw = [];
        let x = document.getElementById(pssw).value;
        let y = document.getElementById(cPssw).value;
        newPssw.push(x);
        confirmPssw.push(y);

        if (newPssw.toString() !== confirmPssw.toString()) {
            document.getElementById(id).innerHTML = "* As senhas não batem.";
        } else {
            document.getElementById(id).innerHTML = "";
        }
    }

    validarCamposMudarSenha(data) {
        console.log("validarCamposMudarSenha");

        if (data.email.toString().length === 0) {
            document.getElementById("demoEmail").innerHTML = "* Campo obrigatório";
        } else if (data.newPssw.toString().length === 0) {
            document.getElementById("demoPssw").innerHTML = "* Campo obrigatório";
        } else if (data.newPssw.toString().length === 0) {
            document.getElementById("demoPssw").innerHTML = "* Campo obrigatório";
        } else if (data.confirmPssw.toString().length === 0) {
            document.getElementById("demoCPssw").innerHTML = "* Campo obrigatório";
        } else {
            document.getElementById("demoEmail").innerHTML = "";
            document.getElementById("demoPssw").innerHTML = "";
            document.getElementById("demoCPssw").innerHTML = "";
            return true;
        }
    }

    validarCamposLogin(data) {
        console.log("validarCamposLogin");

        if (data.email.toString().length === 0) {
            document.getElementById("demoEmail").innerHTML = "* Campo obrigatório";
        } else if (data.password.toString().length === 0) {
            document.getElementById("demoSenha").innerHTML = "* Campo obrigatório";
        } else {
            document.getElementById("demoEmail").innerHTML = "";
            document.getElementById("demoSenha").innerHTML = "";
            return true;
        }

    }

    validarCamposCadastro(data) {
        console.log("validarCamposCadastro");

        if (data.name.toString().length === 0) {
            document.getElementById("demoName").innerHTML = "* Campo obrigatório";
        } else if (data.lastName.toString().length === 0) {
            document.getElementById("demoLastName").innerHTML = "* Campo obrigatório";
        } else if (data.cpf.toString().length === 0) {
            document.getElementById("demoCpf").innerHTML = "* Campo obrigatório";
        } else if (data.email.toString().length === 0) {
            document.getElementById("demoEmail").innerHTML = "* Campo obrigatório";
        } else if (data.password.toString().length === 0) {
            document.getElementById("demoPssw").innerHTML = "* Campo obrigatório";
        } else if (data.cPssw.toString().length === 0) {
            document.getElementById("demoCPssw").innerHTML = "* Campo obrigatório";
        } else {
            document.getElementById("demoCPssw").innerHTML = "";
            document.getElementById("demoName").innerHTML = "";
            document.getElementById("demoLastName").innerHTML = "";
            document.getElementById("demoCpf").innerHTML = "";
            document.getElementById("demoEmail").innerHTML = "";
            document.getElementById("demoPssw").innerHTML = "";
            return true;
        }

    }

    validarCamposBanco(data) {
        console.log("validarCamposBanco");

        if (data.agencia.toString().length === 0) {
            document.getElementById("demoAgencia").innerHTML = "* Campo obrigatório";
        } else if (data.conta.toString().length === 0) {
            document.getElementById("demoConta").innerHTML = "* Campo obrigatório";
        } else {
            document.getElementById("demoConta").innerHTML = "";
            document.getElementById("demoAgencia").innerHTML = "";
            return true;
        }

    }

}

export default new Security();