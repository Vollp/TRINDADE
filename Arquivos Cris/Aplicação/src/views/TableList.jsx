
import React from "react";

// reactstrap components
import {
  Card,
  CardHeader,
  CardBody,
  CardTitle,
  Table,
  Row,
  Col
} from "reactstrap";

class Tables extends React.Component {
  render() {
    return (
      <>
        <div className="content">
          <Row>
            <Col md="12">
              <Card>
                <CardHeader>
                  <CardTitle tag="h4">Tabela Simples Inserindo Dados e Economizando</CardTitle>
                </CardHeader>
                <CardBody>
                  <Table className="tablesorter" responsive>
                    <thead className="text-primary">
                      <tr>
                        <th>Nome</th>
                        <th>Data</th>
                        <th>Hora</th>
                        <th className="text-center">Salário</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>08:45:21</td>
                        <td className="text-center">$36,32</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>09:03:21</td>
                        <td className="text-center">$23,23</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>10:20:21</td>
                        <td className="text-center">$56,12</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>11:54:41</td>
                        <td className="text-center">$38,23</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>12:10:32</td>
                        <td className="text-center">$63,23</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>12:20:21</td>
                        <td className="text-center">$78,33</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>12:56:21</td>
                        <td className="text-center">$98,22</td>
                      </tr>
                    </tbody>
                  </Table>
                </CardBody>
              </Card>
            </Col>
          </Row>
        </div>
        <div className="content">
          <Row>
            <Col md="12">
              <Card>
                <CardHeader>
                  <CardTitle tag="h4">Tabela Simples de Gastos</CardTitle>
                </CardHeader>
                <CardBody>
                  <Table className="tablesorter" responsive>
                    <thead className="text-primary">
                      <tr>
                        <th>Nome</th>
                        <th>data</th>
                        <th>hora</th>
                        <th className="text-center">Salário</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                      <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>08:45:21</td>
                        <td className="text-center">$36,32</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>09:03:21</td>
                        <td className="text-center">$23,4</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>10:20:21</td>
                        <td className="text-center">$56,32</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>11:54:41</td>
                        <td className="text-center">$38,73</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>12:10:32</td>
                        <td className="text-center">$633,2</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>12:20:21</td>
                        <td className="text-center">$278,12</td>
                      </tr>
                      <tr>
                        <td>Felipe Avila</td>
                        <td>29-11-2019</td>
                        <td>12:56:21</td>
                        <td className="text-center">$928,12</td>
                      </tr>
                    </tbody>
                  </Table>
                </CardBody>
              </Card>
            </Col>
          </Row>
        </div>
      </>
    );
  }
}
export default Tables;
