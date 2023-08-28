import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [data, setData] = useState('')
  useEffect(() => {
    axios.get('/api/data')
    .then(res => setData(res.data))
    .catch(err => console.log(err))
  }, [])

  return (
    <div className="App">
      <span>받아온: {data}</span>
    </div>
  );
}

export default App;
