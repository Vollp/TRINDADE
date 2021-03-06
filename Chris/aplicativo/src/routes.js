import Dashboard from "@material-ui/icons/Dashboard";

import Person from "@material-ui/icons/Person";

import DashboardPage from "views/Dashboard/Dashboard.js";

import UserProfile from "views/UserProfile/UserProfile.js";

import TableList from "views/TableList/TableList.js";

const dashboardRoutes = [
  {
    path: "/dashboard",
    name: "Dashboard",
    icon: Dashboard,
    component: DashboardPage,
    layout: "/admin"
  },
  {
    path: "/usuarios",
    name: "Perfil de Usuário",
    icon: Person,
    component: UserProfile,
    layout: "/admin"
  },
  {
    path: "/extro",
    name: "Extrato",
    icon: "content_paste",
    component: TableList,
    layout: "/admin"
  },

];

export default dashboardRoutes;
