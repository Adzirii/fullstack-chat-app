import './App.css'
import Taa from "./Taa.jsx";

export default function App() {
    return (
        <>
            <div>Who are you?</div>
            <input id={"name"} type='text' placeholder={"taa"}/>
            <button onClick={() => {
                console.log("hi")

                fetch("http://localhost:8080/api/login", {
                    method: "POST",
                    mode: "cors",
                    cache: "no-cache",
                    credentials: "same-origin",
                    headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({"username": "adziri", "password": 'Textual content'})
                }).then((response) => {
                    return response.json();
                })
                    .catch((error) => console.log(error));
                console.log("success")
            }}>Taa
            </button>
            <div>Huh...</div>
            <Taa></Taa>
            <div id={'uu'}>Wat?</div>
        </>
    );
}
