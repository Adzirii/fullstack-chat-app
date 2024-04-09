import React from 'react'
import ReactDOM from 'react-dom/client'
import './index.css'
import App from "./App.jsx";
import Routing from "./Routing.jsx";

ReactDOM.createRoot(document.getElementById('root')).render(
    <React.StrictMode>
        <Routing/>
        <App></App>
    </React.StrictMode>,
)