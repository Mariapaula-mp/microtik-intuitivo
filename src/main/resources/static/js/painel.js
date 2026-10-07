fetch("/api/hotspot/status")
    .then(response => response.text())
    .then(data => {
        console.log(data);
        console.log("painel.js foi carregado!");
    });