const stockLabels = /*[[${itemNames}]]*/ ["Pizza", "Burger", "Pasta", "Salad"];
const stockData = /*[[${itemStocks}]]*/ [12, 8, 15, 5];

const stockCtx = document.getElementById('stockChart').getContext('2d');
const stockChart = new Chart(stockCtx, {
    type: 'bar',
    data: {
        labels: stockLabels,
        datasets: [{
            label: 'Stock',
            data: stockData,
            backgroundColor: '#e17055'
        }]
    },
    options: {
        responsive: true,
        plugins: {
            legend: { display: false }
        }
    }
});