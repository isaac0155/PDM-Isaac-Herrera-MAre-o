import React, {Component} from 'react';
import {StyleSheet, View, Text, Image} from 'react-native';
import imgLogo from '../images/logo.jpg'

export default class Logo extends Component {
  constructor(props) {
    console.log(props.text);
    super(props);
  }
  render(){
    return(
      <View style={styles.container}>
        <Image source={imgLogo} style={styles.images}/>
        <Text style={styles.text}>Goowia Solitions</Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container:{
    flex:1,
    alignItems: 'center',
    justifyContent: 'center'
  },
  images:{
    width: 80,
    height: 80
  },
  text:{
    color: 'white',
    fontWeight:'bold',
    backgroundColor: 'transparent',
    marginTop: 50,
  }
});
