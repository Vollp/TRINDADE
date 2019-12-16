import React, { Component } from 'react'

import Security from '../services/Security'

import '/login.css'
 
import Api from '../services/api'

import MaskedInput  from 'react-maskedinput'

import { Link, withRouter } from 'react-router-dom'

import {Redirect} from "react-router"
 
class Login extends Component {

    constructor(props) {
        super(props);
        this.state = {
            name: '',
            lastName: '',
            cpf: '',
            email: '',
            password: '',
            cPassword: '',
            isLogin: true,
        };

        this.register = this.register.bind(this);
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }


    // handleSignUp = async e =>{
    //     e.preventDefault();
    //     const{ userName,lastName, cpf, email, password, cPassword } = this.state;
    //     if(!userName || !lastName || !cpf || !email || !password || !cPassword){
    //         this.setState({ error: "Preencha todos os dados para se cadastrar" });
    //     }
    //     else{
    //         try{
    //                 await api.post("/login", { userName, lastName, cpf, email, password, cPassword });
    //                 this.props.history.push("/");
    //         }catch(err){
    //             console.log(err)
    //             this.setState({ error: "Ocorreu um erro ao registrar sua conta" })
    //         }
    //     }
    // }

    entrar() {
        let values = {
            EMAIL: this.state.email,
            SENHA: Security.encriptar(this.state.password)
        };

        console.log(values);

        if (Security.validarCamposLogin(this.state)) {

            Api.entrar(values)
                .then(() => {
                    alert("Bem vindo!")
                })
                .catch(() => {
                    alert("Usuário não cadastrado.")
                })
        }
    };

    componentDidMount = () => {
        const signUpButton = document.getElementById('signUp');
        const signInButton = document.getElementById('signIn');
        const container = document.getElementById('container');

        signUpButton.addEventListener('click', () => {
            container.classList.add("right-panel-active");
        });

        signInButton.addEventListener('click', () => {
            container.classList.remove("right-panel-active");
        });
    }

    cadastrar() {
        let values = {
            NOME: this.state.name + ' ' + this.state.lastName,
            CPF: this.state.cpf,
            EMAIL: this.state.email,
            SENHA: Security.encriptar(this.state.password)
        };

        console.log(values);

        if (Security.validarCamposCadastro(this.state)) {

            Api.cadastrar(values)
                .then(() => {
                    alert(`Usuário cadastrado`);
                    this.chamaBanco();
                })
                .catch(() => {
                    alert(`Usuário já cadastrado`);
                })
        }
    }


    //componentWillUnmount

    register() {
        let values = {
            Nome: this.state.name + '' + this.state.lastName,
            CPF: this.state.cpf,
            Email: this.state.email,
            Senha: this.state.password
        };
    }
    handleChange(e) {
        let target = e.target;
        let value = target.type === 'checkbox' ? target.cecked : target.value;
        let name = target.name;

        this.setState({
            [name]: value
        });
    }

    btnHandler = () => {
        let bool = !this.state.isLogin;
        this.setState({isLogin:bool})
    }

    handleSubmit(e) {
        e.preventDefault();
        this.register();
    }

    chamaBanco = () => {
        this.setState({
            redirect: true
        });
    };
    render() {

        if (this.state.redirect) {
            return <Redirect to='/banco'/>
        }

        return (
            <div>
                <div id="container" className={`${this.state.isLogin ? "" : "right-panel-active"} container`}>
                    <div className="form-container sign-up-container">
                        <form action="#">
                            <h1>Cadastro</h1>
                            <span>ou use seu email para cadastrar</span>
                            <input type="text" placeholder="Nome" name="name" value={this.state.name} onChange={this.handleChange} />
                            <div>
                            <span id={"demoName"}/>
                            </div>
                            <input type="text" placeholder="Sobrenome" name="lastName" value={this.state.lastName} onChange={this.handleChange}/>
                            <div>
                            <span id={"demoLastName"}/>
                            </div>
                            <MaskedInput mask="111.111.111-11" maxLength='14' type="cpf" placeholder="000.000.000-00" name="cpf" value={this.state.cpf} onChange={this.handleChange}/>
                            <div>
                            <span id={"demoCpf"}/>
                            </div>
                            <input type="email" placeholder="Email" name="email" value={this.state.email} onChange={this.handleChange} />
                            <div>
                            <span id={"demoEmail"}/>
                            </div>
                            <input type="password" placeholder="Senha" name="password" value={this.state.password} onChange={this.handleChange} />
                            <div>
                            <span id={"demoPssw"}/>
                            </div>
                            <input type="password" placeholder="Confirmar senha" name="cPassword" value={this.state.cPassword} onChange={this.handleChange}/>
                            <div>
                            <span id={"demoCPssw"}/>
                            </div>

                            <button type="submit" onClick={() => this.cadastrar()} >Cadastrar</button>
                        </form>
                    </div>
                    <div className="form-container sign-in-container">
                        <form action="#">
                            <h1>Login</h1>

                            <span>ou use sua conta</span>
                            <input type="email" placeholder="Email" />
                            <input type="password" placeholder="Senha" />
                            <a href="#">Esqueceu a senha?</a>
                            <button type="submit" onClick={() => this.chamaBanco()} >Entrar</button>
                        </form>
                    </div>
                    <div className="overlay-container">
                        <div className="overlay">
                            <div className="overlay-panel overlay-left">
                                <h1>Faça já sua conta!</h1>
                                <p>Para se manter conectado, faça login com suas informações pessoais.</p>
                                <button type="submit" className="ghost" onClick={this.btnHandler} id="signIn">Entrar</button>
                            </div>
                            <div className="overlay-panel overlay-right">
                                <h1>Olá, amigo!</h1>
                                <p>Digite seus dados pessoais e comece a jornada conosco</p>
                                <button type="submit" className="ghost" onClick={this.btnHandler} id="signUp">Cadastro</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        )
    }
}

export default withRouter(Login);