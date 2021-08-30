import React from 'react'
import Empdisplay from './Empdisplay'
function Employee() {
   
    const employees=[
        {
            name:'Charlie',
            job:' janitor'
        },
        {
            name:'Mac',
            job: 'bouncer'
        },
        {
            name:'Dee',
            job:'janitor'
        },
        {
            name:'Deniess',
            job: 'janitor'
        }
    ]
    const employeeList=employees.map(emp=><Empdisplay key={emp.name} emp={emp}/>)
    return (
       <React.Fragment>
        <table className="a">
          
                  <th>  Name  </th>
                  <th>  Job  </th>
              <tbody>
              {employeeList}
              </tbody>
        </table>
        </React.Fragment>
    )
}

export default Employee
