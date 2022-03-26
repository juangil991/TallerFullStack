import React,{Component} from 'react';
import Numbersdice from '../components/numbersdice';
import Results from '../components/results';

class App extends Component {// component stateful
    render() {
      return (
        <div>
          <h3>Lista Random</h3>
          <p>Sistema Ramdom - Demo</p>
          <Numbersdice/>
          <Results/>
        </div>
      )
    }
  }
  
  export default App