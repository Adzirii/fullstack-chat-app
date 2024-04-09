import './App.css'
import Taa from "./Taa.jsx";

export default function App() {
    return (
        <>
            <div>Who are you?</div>
            <input id={"name"} type='text' placeholder={"taa"} />
            <button onClick={() => {
                let name = document.getElementById("name").value;
                let a = document.createElement("div");
                a.innerText = `${name} пошел ты нахуй`;
                fetch()
                document.getElementById('uu').appendChild(a);
            }}>Taa</button>
            <div>Huh...</div>
            <Taa ></Taa>
            <div id={'uu'}>Wat?</div>
        </>
    );
}
