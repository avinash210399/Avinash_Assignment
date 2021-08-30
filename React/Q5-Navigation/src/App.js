import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Link, NavLink, Redirect, Prompt} from 'react-router-dom';
import Route from 'react-router-dom/Route';
import './mycss.css'
const user =({match})=>{ return (<h1>welcome user {match.params.username}</h1>)}
function App() {
  
  return (
    <Router>
       
    <div className="App">
      <div className="a">
      <NavLink to="/home"  exact activeStyle={
        {backgroundColor:'pink'}
      }> HOME</NavLink> 

      <NavLink to="/projects"exact activeStyle={
        {backgroundColor:'pink'}
      } > PROJECTS</NavLink>

    <NavLink to="/about"  exact activeStyle={
        {backgroundColor:'pink'}
      }> ABOUT</NavLink> 

    <NavLink to="/contact"  exact activeStyle={
        {backgroundColor:'pink'}
      }> CONTACT</NavLink> 

    <Route path="/home"  exact  strict render={
      ()=>{
        return(<h2>you choose <span> HOME</span></h2>)
      }
    }
   
    />
     </div>
    <Route path="/Projects"  exact strict render={
      ()=>{
        return(<h2>you choose <span> PROJECTS</span></h2>)
      }
    }
    
    />
     <Route path="/about"  exact strict render={
      ()=>{
        return(<h2>you choose <span> ABOUT</span></h2>)
      }
    }
    
    />
     <Route path="/contact"  exact strict render={
      ()=>{
        return(<h2>you choose <span> CONTACT</span></h2>)
      }
    }
    
    />
    


    
    
    </div>
    </Router>
  );
}

export default App;
