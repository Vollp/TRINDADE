
import React from "react";
// biblioteca nodejs que concatena classes
import classNames from "classnames";
// plugin de reação usado para criar gráficos
import { Line, Bar } from "react-chartjs-2";

// reactstrap componentes
import {
  Button,
  ButtonGroup,
  Card,
  CardHeader,
  CardBody,
  CardTitle,
  DropdownToggle,
  DropdownMenu,
  DropdownItem,
  UncontrolledDropdown,
  Label,
  FormGroup,
  Input,
  Table,
  Row,
  Col,
  UncontrolledTooltip
} from "reactstrap";

// Componentes do núcleo
import {
  chartExample1,
  chartExample2,
  chartExample3,
  chartExample4
} from "variables/charts.jsx";

class Rtl extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      bigChartData: "data1"
    };
  }
  setBgChartData = name => {
    this.setState({
      bigChartData: name
    });
  };
  render() {
    return (
      <>
        <div className="content">
          <Row>
            <Col xs="12">
              <Card className="card-chart">
                <CardHeader>
                  <Row>
                    <Col className="text-right" sm="6">
                      <h5 className="card-category">felipe </h5>
                      <CardTitle tag="h2">أداء</CardTitle>
                    </Col>
                    <Col sm="6">
                      <ButtonGroup
                        className="btn-group-toggle float-left"
                        data-toggle="buttons"
                      >
                        <Button
                          tag="label"
                          className={classNames("btn-simple", {
                            active: this.state.bigChartData === "data1"
                          })}
                          color="primary"
                          id="0"
                          size="sm"
                          onClick={() => this.setBgChartData("data1")}
                        >
                          <input
                            defaultChecked
                            className="d-none"
                            name="options"
                            type="radio"
                          />
                          <span className="d-none d-sm-block d-md-block d-lg-block d-xl-block">
                            حسابات
                          </span>
                          <span className="d-block d-sm-none">
                            <i className="tim-icons icon-single-02" />
                          </span>
                        </Button>
                        <Button
                          color="primary"
                          id="1"
                          size="sm"
                          tag="label"
                          className={classNames("btn-simple", {
                            active: this.state.bigChartData === "data2"
                          })}
                          onClick={() => this.setBgChartData("data2")}
                        >
                          <input
                            className="d-none"
                            name="options"
                            type="radio"
                          />
                          <span className="d-none d-sm-block d-md-block d-lg-block d-xl-block">
                            المشتريات
                          </span>
                          <span className="d-block d-sm-none">
                            <i className="tim-icons icon-gift-2" />
                          </span>
                        </Button>
                        <Button
                          color="primary"
                          id="2"
                          size="sm"
                          tag="label"
                          className={classNames("btn-simple", {
                            active: this.state.bigChartData === "data3"
                          })}
                          onClick={() => this.setBgChartData("data3")}
                        >
                          <input
                            className="d-none"
                            name="options"
                            type="radio"
                          />
                          <span className="d-none d-sm-block d-md-block d-lg-block d-xl-block">
                            جلسات
                          </span>
                          <span className="d-block d-sm-none">
                            <i className="tim-icons icon-tap-02" />
                          </span>
                        </Button>
                      </ButtonGroup>
                    </Col>
                  </Row>
                </CardHeader>
                <CardBody>
                  <div className="chart-area">
                    <Line
                      data={chartExample1[this.state.bigChartData]}
                      options={chartExample1.options}
                    />
                  </div>
                </CardBody>
              </Card>
            </Col>
          </Row>
          <Row>
            <Col className="text-right" lg="4">
              <Card className="card-chart">
                <CardHeader>
                  <h5 className="card-category"> felipe</h5>
                  <CardTitle tag="h3">
                    <i className="tim-icons icon-bell-55 text-primary" />{" "}
                    763,215
                  </CardTitle>
                </CardHeader>
                <CardBody>
                  <div className="chart-area">
                    <Line
                      data={chartExample2.data}
                      options={chartExample2.options}
                    />
                  </div>
                </CardBody>
              </Card>
            </Col>
            <Col className="text-right" lg="4">
              <Card className="card-chart">
                <CardHeader>
                  <h5 className="card-category">felipe</h5>
                  <CardTitle tag="h3">
                    <i className="tim-icons icon-delivery-fast text-info" />{" "}
                    3,500€
                  </CardTitle>
                </CardHeader>
                <CardBody>
                  <div className="chart-area">
                    <Bar
                      data={chartExample3.data}
                      options={chartExample3.options}
                    />
                  </div>
                </CardBody>
              </Card>
            </Col>
            <Col className="text-right" lg="4">
              <Card className="card-chart">
                <CardHeader>
                  <h5 className="card-category">felipe </h5>
                  <CardTitle tag="h3">
                    <i className="tim-icons icon-send text-success" /> 12,100K
                  </CardTitle>
                </CardHeader>
                <CardBody>
                  <div className="chart-area">
                    <Line
                      data={chartExample4.data}
                      options={chartExample4.options}
                    />
                  </div>
                </CardBody>
              </Card>
            </Col>
          </Row>
          <Row>
            <Col className="text-center" lg="6" sm="6">
              <Card className="card-tasks text-left">
                <CardHeader className="text-right">
                  <h6 className="title d-inline">volp</h6>{" "}
                  <p className="card-category d-inline">gois</p>
                  <UncontrolledDropdown className="float-left">
                    <DropdownToggle
                      aria-expanded={false}
                      aria-haspopup={true}
                      caret
                      color="link"
                      data-toggle="dropdown"
                      id="dropdownMenuLink"
                    >
                      <i className="tim-icons icon-settings-gear-63" />
                    </DropdownToggle>
                    <DropdownMenu aria-labelledby="dropdownMenuLink">
                      <DropdownItem
                        href="#pablo"
                        onClick={e => e.preventDefault()}
                      >
                        عمل
                      </DropdownItem>
                      <DropdownItem
                        href="#pablo"
                        onClick={e => e.preventDefault()}
                      >
                        عمل آخر
                      </DropdownItem>
                      <DropdownItem
                        href="#pablo"
                        onClick={e => e.preventDefault()}
                      >
                        شيء آخر هنا
                      </DropdownItem>
                    </DropdownMenu>
                  </UncontrolledDropdown>
                </CardHeader>
                <CardBody>
                  <div className="table-full-width table-responsive">
                    <Table>
                      <tbody>
                        <tr>
                          <td className="text-center">
                            <FormGroup check>
                              <Label check>
                                <Input
                                  defaultChecked
                                  defaultValue=""
                                  type="checkbox"
                                />
                                <span className="form-check-sign">
                                  <span className="check" />
                                </span>
                              </Label>
                            </FormGroup>
                          </td>
                          <td className="text-right">
                            <p className="title"> volp  </p>
                            <p className="text-muted"> gois </p>
                          </td>
                          <td className="td-actions">
                            <Button
                              color="link"
                              id="tooltip591536518"
                              title=""
                              type="button"
                            >
                              <i className="tim-icons icon-settings" />
                            </Button>
                            <UncontrolledTooltip
                              delay={0}
                              target="tooltip591536518"
                              placement="right"
                            > 
                            </UncontrolledTooltip>
                          </td>
                        </tr>
                        <tr>
                          <td className="text-center">
                            <FormGroup check>
                              <Label check>
                                <Input defaultValue="" type="checkbox" />
                                <span className="form-check-sign">
                                  <span className="check" />
                                </span>
                              </Label>
                            </FormGroup>
                          </td>
                          <td className="text-right">
                            <p className="title">consegui</p>
                            <p className="text-muted">
                            felipe</p>
                          </td>
                          <td className="td-actions">
                            <Button
                              color="link"
                              id="tooltip36890049"
                              title=""
                              type="button"
                            >
                              <i className="tim-icons icon-settings" />
                            </Button>
                            <UncontrolledTooltip
                              delay={0}
                              target="tooltip36890049"
                              placement="right"
                            >felipe
                            </UncontrolledTooltip>
                          </td>
                        </tr>
                        <tr>
                          <td className="text-center">
                            <FormGroup check>
                              <Label check>
                                <Input defaultValue="" type="checkbox" />
                                <span className="form-check-sign">
                                  <span className="check" />
                                </span>
                              </Label>
                            </FormGroup>
                          </td>
                          <td className="text-right">
                            <p className="title"></p>
                            <p className="text-muted">felipe
                            </p>
                          </td>
                          <td className="td-actions">
                            <Button
                              color="link"
                              id="tooltip5456779"
                              title=""
                              type="button"
                            >
                              <i className="tim-icons icon-settings" />
                            </Button>
                            <UncontrolledTooltip
                              delay={0}
                              target="tooltip5456779"
                              placement="right"
                            >
                            </UncontrolledTooltip>
                          </td>
                        </tr>
                        <tr>
                          <td className="text-center">
                            <FormGroup check>
                              <Label check>
                                <Input
                                  defaultChecked
                                  defaultValue=""
                                  type="checkbox"
                                />
                                <span className="form-check-sign">
                                  <span className="check" />
                                </span>
                              </Label>
                            </FormGroup>
                          </td>
                          <td className="text-right">
                            <p className="title">
                            </p>
                            <p className="text-muted">
                            </p>
                          </td>
                          <td className="td-actions">
                            <Button
                              color="link"
                              id="tooltip989428493"
                              title=""
                              type="button"
                            >
                              <i className="tim-icons icon-settings" />
                            </Button>
                            <UncontrolledTooltip
                              delay={0}
                              target="tooltip989428493"
                              placement="right"
                            >
                               
                            </UncontrolledTooltip>
                          </td>
                        </tr>
                        <tr>
                          <td className="text-center">
                            <FormGroup check>
                              <Label check>
                                <Input
                                  defaultChecked
                                  defaultValue=""
                                  type="checkbox"
                                />
                                <span className="form-check-sign">
                                  <span className="check" />
                                </span>
                              </Label>
                            </FormGroup>
                          </td>
                          <td className="text-right">
                            <p className="title"></p>
                            <p className="text-muted">
                            </p>
                          </td>
                          <td className="td-actions">
                            <Button
                              color="link"
                              id="tooltip169784793"
                              title=""
                              type="button"
                            >
                              <i className="tim-icons icon-settings" />
                            </Button>
                            <UncontrolledTooltip
                              delay={0}
                              target="tooltip169784793"
                              placement="right"
                            >
                               
                            </UncontrolledTooltip>
                          </td>
                        </tr>
                        <tr>
                          <td className="text-center">
                            <FormGroup check>
                              <Label check>
                                <Input defaultValue="" type="checkbox" />
                                <span className="form-check-sign">
                                  <span className="check" />
                                </span>
                              </Label>
                            </FormGroup>
                          </td>
                          <td className="text-right">
                            <p className="title"></p>
                            <p className="text-muted">
                            </p>
                          </td>
                          <td className="td-actions">
                            <Button
                              color="link"
                              id="tooltip554497871"
                              title=""
                              type="button"
                            >
                              <i className="tim-icons icon-settings" />
                            </Button>
                            <UncontrolledTooltip
                              delay={0}
                              target="tooltip554497871"
                              placement="right"
                            >
                               
                            </UncontrolledTooltip>
                          </td>
                        </tr>
                      </tbody>
                    </Table>
                  </div>
                </CardBody>
              </Card>
            </Col>
            <Col lg="6" sm="6">
              <Card>
                <CardHeader className="text-right">
                  <CardTitle tag="h4"></CardTitle>
                </CardHeader>
                <CardBody>
                  <Table className="tablesorter" responsive>
                    <thead className="text-primary">
                      <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th className="text-center">راتب</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td> </td>
                        <td></td>
                        <td></td>
                        <td className="text-center">$36,738</td>
                      </tr>
                      <tr>
                        <td> </td>
                        <td></td>
                        <td>-</td>
                        <td className="text-center">$23,789</td>
                      </tr>
                      <tr>
                        <td> </td>
                        <td></td>
                        <td></td>
                        <td className="text-center">$56,142</td>
                      </tr>
                      <tr>
                        <td> </td>
                        <td> </td>
                        <td> </td>
                        <td className="text-center">$38,735</td>
                      </tr>
                      <tr>
                        <td> </td>
                        <td></td>
                        <td></td>
                        <td className="text-center">$63,542</td>
                      </tr>
                      <tr>
                        <td> </td>
                        <td></td>
                        <td></td>
                        <td className="text-center">$78,615</td>
                      </tr>
                      <tr>
                        <td> </td>
                        <td></td>
                        <td></td>
                        <td className="text-center">$98,615</td>
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

export default Rtl;
