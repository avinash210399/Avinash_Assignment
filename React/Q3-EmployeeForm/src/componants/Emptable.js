import React, { Component } from 'react'
import './mycss.css'


/*import Empform from './Empform'
class Emptable extends Component {
    constructor(props) {
        super(props)

        this.state = {
            name: '',
            job:''        };

        this.handleSubmit=this.handleSubmit.bind(this)
        this.handleonchangeJob=this.handleonchangeJob.bind(this)
        this.handleonchangeName=this.handleonchangeName.bind(this)  
    }
    
    handleonchangeName(event){
     this.setState({[this.name]: event.target.value}) ; 
     console.log(this.state.name)
    }
    handleonchangeJob(event){
       
    this.setState({job: event.target.value})  
    
    }
    //onsubmit sets the value to empname variable by following method
     handleSubmit(event){
          this.setState({job: event.target.value})  
          this.setState({[this.name]: event.target.value}) ; 
        //default behavoiur of form is to refesh after submit there to prevent that
        event.preventDefault();
    }
     
   
    render() {
        return (
            <React.Fragment>
           <h1>{this.name}</h1>
          
            <hr/>
            <form onSubmit={this.handleSubmit}>
           
                <legend><strong> Add New Employee</strong></legend>
                <fieldset>
                    <label ><strong>Name: </strong></label>
                    <input  type="text" value={this.state.name} onChange={this.handleonchangeName}/><br/><br/>

                    <label ><strong>Job: </strong></label>
                    <input id="job"  type="text" value={this.state.job} onChange={this.handleonchangeJob}/><br/><br/>

                    <button type="submit"  >Submit</button><br/>
                </fieldset>
                
            </form>
           
           
            </React.Fragment>
        )
    }
}

export default Emptable*/
