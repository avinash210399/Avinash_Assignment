
import Emprow from './Emprow'


import React, { Component } from 'react'

export class Empform extends Component {
    
    render() {
        return (
            <div>
                <table>
                  <thead>
                  <tr>
                      <th>
                          Name
                      </th>
                      <th>
                          Job
                      </th>
                      <th>
                         button 
                      </th>
                  </tr>
                  <tr>
                  <Emprow name ={this.props.namvalue} job={this.props.jobValue}/>
                  </tr>
                  </thead>
              </table>    
            </div>
        )
    }
}

export default Empform




