import React from 'react'
import './mycss.css'
function Empdisplay({emp}) {

     

    return (
       
              <React.Fragment>
                 <tr className="a">
                      <td>
                          {emp.name}
                      </td>
                      <td>
                          {emp.job}
                      </td>
                    
                  </tr>
                  </React.Fragment>
       
    )
}

export default Empdisplay
