// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = 'Nunito', '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#858796';

//GRAFICO DO LADO DO DE LINHAS
// Pie Chart Example
var ctx = document.getElementById("myPieChart");
var myPieChart = new Chart(ctx, {
    type: 'doughnut',
    data: {
        //nomes quando vc clica
        labels: ["Gastos", "Entrada de Dinheiro", "Economia"],
        datasets: [{
            //valores vindo do banco ou de uma query
            data: [45, 24, 12],
            //cor da parte da dashboard de relatorio
            backgroundColor: ['#d81414', '#1cc88a', '#30dbd3'],
            //cor quando vc clica em cima da parte da dashboard de relatorio
            hoverBackgroundColor: ['#d81414', '#17a673', '#2c9faf'],
            hoverBorderColor: "rgba(234, 236, 244, 1)",
        }],
    },
    options: {
        maintainAspectRatio: false,
        tooltips: {
            backgroundColor: "rgb(255,255,255)",
            bodyFontColor: "#858796",
            borderColor: '#dddfeb',
            borderWidth: 1,
            xPadding: 15,
            yPadding: 15,
            displayColors: false,
            caretPadding: 10,
        },
        legend: {
            display: false
        },
        cutoutPercentage: 80,
    },
});