import React, { Component } from 'react'

import '../assets/css/grayscale.css';

import '../assets/fontawesome-free/css/all.min.css';

import '../assets/css/bootstrap.min.css';

const time = "< Time de Desenvolvimento />"

export default class Home extends Component {
    render() {
        return (
            <div className="Home">
                <nav className="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
                    <div className="container">
                        <a className="navbar-brand js-scroll-trigger" href="#page-top"/>
                        <button className="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                                data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false"
                                aria-label="Toggle navigation">
                            Menu
                            <i className="fas fa-bars"/>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarResponsive">
                            <ul className="navbar-nav ml-auto">
                                <li className="nav-item">
                                    <a className="nav-link js-scroll-trigger" href="#about">Sobre</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link js-scroll-trigger" href="#projects">Equipe</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link js-scroll-trigger" href="#signup">Contato</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link js-scrool-trigger" >Login</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                {/*Header*/}
                <header className="masthead">
                    <div className="container d-flex h-100 align-items-center">
                        <div className="mx-auto text-center">
                            <h1 className="mx-auto my-0 text-uppercase">Thunderbolts</h1>
                            <h2 className="text-white-50 mx-auto mt-2 mb-5">A Startup que pensa diferente, para o bem do
                                cliente.</h2>
                            <a href="#about" className="btn btn-primary js-scroll-trigger">Mais Informações</a>
                        </div>
                    </div>
                </header>

                {/*About Section*/}
                <section id="about" className="about-section text-center">
                    <div className="container">
                        <div className="row" id="img-edit">
                            <div className="col-lg-8 mx-auto">
                                <h2 className="text-white mb-4">Sobre nós</h2>
                                <p className="text-white-50">A Startup Thunderbolts é a mais nova empresa de softwares
                                    focada em problemas
                                    financeiros que o pais vem enfrentando.
                                    A principal ideia é uma plataforma na qual o usuário poderá ter maior controle sobre
                                    seus
                                    gastos. </p>
                            </div>
                        </div>
                        <img src={ require('../assets/img/Logo.png')} style={{ width:"40%", height:"30%"}} className="img-fluid" alt=""/>
                    </div>
                </section>

                {/*Projects Section*/}
                <section id="projects" className="projects-section bg-light">
                    <div className="container">
                        <div className="row justify-content-center no-gutters mb-5 mb-lg-0">
                            <div className="col-lg-6">
                                <img className="img-fluid" src={require('../assets/img/imagemJ.png')}   alt=""/>
                            </div>
                            <div className="col-lg-6">
                                <div className="bg-black text-center h-100 project">
                                    <div className="d-flex h-100">
                                        <div className="project-text w-100 my-auto text-center text-lg-left">
                                            <h4 className="text-white">Missão</h4>
                                            <p className="mb-0 text-white-50">Atingir todos os públicos para que tenham
                                                um controle
                                                financeiro. Assim sendo um plataforma de referência no ramo Financeiro e
                                                Tecnológico.</p>
                                            <hr className="d-none d-lg-block mb-0 ml-0"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div className="row justify-content-center no-gutters">
                            <div className="col-lg-6">
                                <img className="img-fluid" src={require('../assets/img/imagemV.jpg')} alt=""/>
                            </div>
                            <div className="col-lg-6 order-lg-first">
                                <div className="bg-black text-center h-100 project">
                                    <div className="d-flex h-100">
                                        <div className="project-text w-100 my-auto text-center text-lg-right">
                                            <h4 className="text-white">Visão</h4>
                                            <p className="mb-0 text-white-50">Ser uma das Startups mais inovadoras da
                                                década.</p>
                                            <hr className="d-none d-lg-block mb-0 mr-0"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div className="row justify-content-center no-gutters mb-5 mb-lg-0">
                            <div className="col-lg-6">
                                <img className="img-fluid" src={require('../assets/img/imagemF.jpg')} alt=""/>
                            </div>
                            <div className="col-lg-6">
                                <div className="bg-black text-center h-100 project">
                                    <div className="d-flex h-100">
                                        <div className="project-text w-100 my-auto text-center text-lg-left">
                                            <h4 className="text-white">Valores</h4>
                                            <p className="mb-0 text-white-50">O cliente, é nosso maior incentivo.</p>
                                            <p className="mb-0 text-white-50">Somos mais que uma simples equipe de
                                                desenvolvimento.</p>
                                            <p className="mb-0 text-white-50">Somos apaixonados em criar ideias
                                                inovadoras.</p>
                                            <hr className="d-none d-lg-block mb-0 ml-0"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        {/* <h3 className="team-title"> { time } </h3> */}

                    </div>
{/* 
                    <div className="format-image">
                        <img src={require('../assets/img/chris3.png')} style={{ height: "280px", width: "280px", borderRadius: "50%", position: "relative", left:"40px" ,top:"50px"}}  />
                        <img src={require('../assets/img/chris3.png')} style={{ height: "280px", width: "280px", borderRadius: "50%", position: "relative", left:"530px", top:"50px"}}  />
                        <img src={require('../assets/img/chris3.png')} style={{ height: "280px", width: "280px", borderRadius: "50%", position: "relative", left:"630px", top:"50px"}}  />
                        <img src={require('../assets/img/chris3.png')} style={{ height: "280px", width: "280px", borderRadius: "50%", position: "relative", left:"410px", bottom:"230px"}}  />
                    </div>
                        <div className="volpe" >
                        <h2  style={{ position:"relative",  top:"40px", }}>Alexandre Volpe</h2>
                        <h4  style={{ position:"relative", top:"50px", }} >Desenvolvedor Back-End <br></br></h4>
                        <h4  style={{ position:"relative", top:"55px", }}> Anáslista de Negócios </h4>
                        </div>

                        <div className="felipe" >
                        <h2  style={{ position:"relative",  top:"40px", }}>Felipe Avila</h2>
                        <h4  style={{ position:"relative", top:"50px", }} >Desenvolvedor Front-End<br></br></h4>
                        <h4  style={{ position:"relative", top:"55px", }}>Designer de UI & UX</h4>
                        </div> */}
                </section>

                

                <section id="signup" className="signup-section">
                    <div className="container">
                        <div className="row">
                            <div className="col-md-10 col-lg-8 mx-auto text-center">

                                <i className="far fa-paper-plane fa-2x mb-2 text-white"/>
                                <h2 className="text-white mb-5">Inscreva-se para receber atualizações</h2>

                                <form className="form-inline d-flex">
                                    <input type="email" className="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0"
                                           id="inputEmail"
                                           placeholder="Digite seu email..."/>
                                    <button type="submit" className="btn btn-primary mx-auto">Inscreva-se</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </section>

                {/*Contact Section*/}
                <section className="contact-section bg-black">
                    <div className="container">

                        <div className="row">

                            <div className="col-md-4 mb-3 mb-md-0">
                                <div className="card py-4 h-100">
                                    <div className="card-body text-center">
                                        <i className="fas fa-map-marked-alt text-primary mb-2"/>
                                        <h4 className="text-uppercase m-0">Endereço</h4>
                                        <hr className="my-4"/>
                                        <div className="small text-black-50">Rua Haddock Lobo, 595</div>
                                    </div>
                                </div>
                            </div>

                            <div className="col-md-4 mb-3 mb-md-0">
                                <div className="card py-4 h-100">
                                    <div className="card-body text-center">
                                        <i className="fas fa-envelope text-primary mb-2"/>
                                        <h4 className="text-uppercase m-0">Email</h4>
                                        <hr className="my-4"/>
                                        <div className="small text-black-50">
                                            <a href="#">thunderbolts@outlook.com</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div className="col-md-4 mb-3 mb-md-0">
                                <div className="card py-4 h-100">
                                    <div className="card-body text-center">
                                        <i className="fas fa-mobile-alt text-primary mb-2"/>
                                        <h4 className="text-uppercase m-0">Telefone</h4>
                                        <hr className="my-4"/>
                                        <div className="small text-black-50">+55 (11) 4002-8922</div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div className="social d-flex justify-content-center">
                            <a href="#" className="mx-2">
                                <i className="fab fa-twitter"/>
                            </a>
                            <a href="#" className="mx-2">
                                <i className="fab fa-facebook-f"/>
                            </a>
                            <a href="#" className="mx-2">
                                <i className="fab fa-github"/>
                            </a>
                        </div>

                    </div>
                </section>

                {/*Footer*/}
                <footer className="bg-black small text-center text-white-50">
                    <div className="container">
                        Thunderbolts &copy; Seu Website 2019
                    </div>
                </footer>
            </div>
        )
    }
}
