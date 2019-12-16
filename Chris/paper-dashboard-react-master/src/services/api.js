import axios from 'axios'

const API_URL = 'http://localhost:8080/';

class Api {

    cadastrar(data) {
        return axios.post(`${API_URL}Login`, data);
    }

    entrar(data) {
        return axios.post(`${API_URL}Login`, data);
    }

    cadastrarBanco(data) {
        return axios.post(`${API_URL}Banco`, data);
    }

    mudarSenha(data) {
        return axios.patch(`${API_URL}recuperarsenha`, data);
    }

}

export default new Api();

