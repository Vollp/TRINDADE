import React from "react";

// reactstrap components
import {
  Button,
  Card,
  CardHeader,
  CardBody,
  CardFooter,
  CardText,
  FormGroup,
  Form,
  Input,
  Row,
  Col
} from "reactstrap";

class UserProfile extends React.Component {
  render() {
    return (
      <>
        <div className="content">
          <Row>
            <Col md="8">
              <Card>
                <CardHeader>
                  <h5 className="title">Editar Perfil</h5>
                </CardHeader>
                <CardBody>
                  <Form>
                    <Row>
                     
                      <Col className="px-md-1" md="3">
                        <FormGroup>
                          <label>Nome de usuário</label>
                          <Input
                            //defaultValue="Fasantos3"
                            placeholder="ex: fasantos3"
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                      <Col className="pl-md-1" md="4">
                        <FormGroup>
                          <label htmlFor="exampleInputEmail1">
                          Endereço de e-mail
                          </label>
                          <Input placeholder="ex: felipeavila62@gmail.com" type ="email" />
                        </FormGroup>
                      </Col>
                    </Row>
                    <Row>
                      <Col className="pr-md-1" md="6">
                        <FormGroup>
                          <label>Primeiro Nome</label>
                          <Input
                           // defaultValue="Felipe"
                            placeholder="Nome do Usuário"
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                      <Col className="pl-md-1" md="6">
                        <FormGroup>
                          <label>Último nome</label>
                          <Input
                            //defaultValue="Santos"
                            placeholder="Ultimo nome"
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                    </Row>
                    <Row>
                      <Col md="12">
                        <FormGroup>
                          <label>Endereço</label>
                          <Input
                            // defaultValue="Eusebio matoso"
                            placeholder="Endereço"
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                    </Row>
                    <Row>
                      <Col className="pr-md-1" md="4">
                        <FormGroup>
                          <label>Cidade</label>
                          <Input
                            //defaultValue="Felipe"
                            placeholder="Cidade"
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                      <Col className="px-md-1" md="4">
                        <FormGroup>
                          <label>País</label>
                          <Input
                            // defaultValue="Pais"
                            placeholder="Pais de Origem"
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                      <Col className="pl-md-1" md="4">
                        <FormGroup>
                          <label>Código postal</label>
                          <Input placeholder="023-02-0343" type="number" />
                        </FormGroup>
                      </Col>
                    </Row>
                    <Row>
                      <Col md="8">
                        <FormGroup>
                          <label>Sobre mim</label>
                          <Input
                            cols="80"
                            defaultValue="sou astuto e sou um gerente de projetos com grandes ambições e 
                            acredito que um bom desenvolvedor Front-End"
                            placeholder="Here can be your description"
                            rows="4"
                            type="textarea"
                          />
                        </FormGroup>
                      </Col>
                    </Row>
                  </Form>
                </CardBody>
                <CardFooter>
                  <Button id="cof" className="btn-fill" color="primary" type="submit">
                    Salvar
                  </Button>
                </CardFooter>
              </Card>
            </Col>
            <Col md="4">
              <Card className="card-user">
                <CardBody>
                  <CardText />
                  <div className="author">
                    <div className="block block-one" />
                    <div className="block block-two" />
                    <div className="block block-three" />
                    <div className="block block-four" />
                    <a href="#pablo" onClick={e => e.preventDefault()}>
                      <img
                        alt="..."
                        className="avatar"
                        src={require("assets/img/fanny.jpeg")}
                      />
                      <h5 className="title">Felipe Avila</h5>
                    </a>
                    <p className="description">Analista de Qualidade SR</p>
                  </div>
                  <div className="card-description">
                   Analista de dados e produtor de Dashboards para clientes e 
                   trabalho com empresas de grande porte que precisam de ajuda para saber o que 
                   se passa em sua empresa e como poderemos melhorar a visualização disso.
                  </div>
                </CardBody>
                <CardFooter>
                  <div className="button-container">
                    <Button className="btn-icon btn-round" color="facebook">
                      <i className="fab fa-facebook"/>
                    </Button>
                    <Button className="btn-icon btn-round" color="twitter">
                      <i className="fab fa-twitter" />
                    </Button>
                    <Button className="btn-icon btn-round" color="google">
                      <i className="fab fa-google-plus" />
                    </Button>
                  </div>
                </CardFooter>
              </Card>
            </Col>
          </Row>
        </div>
      </>
    );
  }
}

export default UserProfile;
