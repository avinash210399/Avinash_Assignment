import React, { useState } from 'react'
import './mycss.css'


import Empform from './Empform'

function Emptable() {

    const [name, setName] = useState("")
    const [job, setJob] = useState("")
    const [array, setArray]=useState([])
   
    function  handleonchangeName(event){
        const newvalue=event.target.value
        setName(newvalue)
    }

     function handleonchangeJob(event){
       const newvalue=event.target.value
       setJob(newvalue)
     }

    //onsubmit sets the value to empname variable by following method
    function  handleSubmit(event){
        setArray((prevValues1)=>{
            return [...prevValues1,name]
        })
        setName("")
        event.preventDefault();
        
    }

    function handleDelete(id){
        setArray((prevValues)=>{
            return prevValues.filter(
                (item,index)=>{
                    return index!==id;
                });
        });
        console.log("deleeted")
    }
    
    return (
        <div>
            <h2 >Hello.! {name}</h2>
           
            <table>
                  <thead>
                  <tr>
                      <th>
                          Name
                      </th>
                      <th>
                         button 
                      </th>
                  </tr>
               
                 { array.map((name,index)=><Empform key={index}  id={index} nameemp={name} onchecked={handleDelete}/>)}
                
             </thead>
              </table>    
          
           
            <hr/>
            <form onSubmit={handleSubmit}>
           
                <legend><strong> Add New Employee</strong></legend>
                <fieldset>
                    <label ><strong>Name: </strong></label>
                    <input  type="text" onChange={handleonchangeName} value={name}/><br/><br/>
                    <button type="submit">ADD</button><br/>
                </fieldset>
                
            </form>  
        </div>
    )
}

export default Emptable


