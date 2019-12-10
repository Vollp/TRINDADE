import Dashboard from "views/Dashboard.jsx";
import Suporte from "views/Suporte.jsx";
//import Icons from "views/Icons.jsx";
//import Map from "views/Map.jsx";
import Economia from "views/Economia.jsx";
import Notifications from "views/Notifications.jsx";
//import Rtl from "views/Rtl.jsx";
import TableList from "views/TableList.jsx";
//import Typography from "views/Typography.jsx";
import UserProfile from "views/UserProfile.jsx";

var routes = [
  {
    path: "/dashboard",
    name: "DASHBOARD",
    //rtlName: "لوحة القيادة",
    icon: "tim-icons icon-chart-pie-36",
    component: Dashboard,
    layout: "/admin"
  },
  {
    path: "/Economia",
    name: "ECONOMIA",
    //rtlName: "لوحة القيادة",
    icon: "tim-icons icon-chart-pie-36",
    component: Economia,
    layout: "/admin"
  },
  {
    path: "/tables",
    name: "Lista de Tabelas",
    //rtlName: "قائمة الجدول",
    icon: "tim-icons icon-puzzle-10",
    component: TableList,
    layout: "/admin"
  },
  {
    path: "/notifications",
    name: "Notificações",
    //rtlName: "إخطارات",
    icon: "tim-icons icon-bell-55",
    component: Notifications,
    layout: "/admin"
  },
  {
    path: "/user-profile",
    name: "Perfil de usuário",
    //rtlName: "ملف تعريفي للمستخدم",
    icon: "tim-icons icon-single-02",
    component: UserProfile,
    layout: "/admin"
  },
  {
    path: "/suporte",
    name: "SUPORTE",
    //rtlName: "لوحة القيادة",
    icon: "tim-icons icon-chart-pie-36",
    component: Suporte,
    layout: "/admin"
  }
];
export default routes;
