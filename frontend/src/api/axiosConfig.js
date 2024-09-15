import axios from 'axios';

export default axios.create({
    baseURL: 'https://b2f0-2409-4043-2415-bebb-b1a2-78d7-ad7d-9d7e.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});