



import React, { Component } from 'react'


function Empform(props) {
    return (
    <React.Fragment>
          
                 <tr>
                    <td>
                     {props.nameemp}
                     </td>  
                      
                      <td>
                      <button onClick={()=>{
                          props.onchecked(props.id);
                      }}>Delete</button>
                    </td>
                 </tr>
                
    </React.Fragment>
    )
}

export default Empform





