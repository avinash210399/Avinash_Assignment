import React from 'react'

function Emprow(props) {
   
   return (

        <React.Fragment>
            <td>
               {props.name}
            </td>    
            <td>
            <button type="submit" onSubmit={props.oncheck}>Delete</button>
            </td>
     </React.Fragment>
    )
}

export default Emprow
