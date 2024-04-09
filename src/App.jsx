import './App.css'
import Taa from "./Taa.jsx";

export default function App() {

    return (
        <>
            <div>Who are you?</div>
            <input id={"name"} type='text' placeholder={"username"}/>
            <input id={"pass"} type='text' placeholder={"password"}/>
            <button onClick={() => {
                fetch("http://localhost:8080/api/login", {
                    method: "POST",
                    mode: "cors",
                    cache: "no-cache",
                    credentials: "same-origin",
                    headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({
                        "username": document.getElementById('name').value,
                        "password":  document.getElementById('pass').value
                    })
                }).then((response) => {
                    console.log(response.text())
                    return response.json();
                })
                    .catch((error) => console.log(error));
            }}>Taa
            </button>
            <div>Huh...</div>
            <Taa></Taa>
            <div id={'uu'}>Wat?</div>
        </>

    );
}
