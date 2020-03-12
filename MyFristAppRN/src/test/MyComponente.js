import React, {Component} from 'react';
import {View, Text,Image} from 'react-native';

export default class MyComponente extends Component
{
  constructor(props)
  {
    console.log(props.text)
    super(props);
  }
  render()
  {
    var imag={uri:this.props.image};
    return(
            <View>
              <Image source={imag} style={{width:300, height:300}}/>
              <Text>{this.props.text}</Text>
            </View>
          );
  }
}
