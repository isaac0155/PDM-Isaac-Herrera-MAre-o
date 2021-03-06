import React, {Component} from 'react';
import {StyleSheet, View, Text, Image} from 'react-native'

import imgLogo from '../images/logo.png'

export default class logo extends Component {
    constructor(props) {
        super(props)
    }

    render() {
        return (
            <View style={styles.container}>
                <Image source={imgLogo} style={styles.Image}/>
                <Text style={styles.Text}>United Nations Space Command</Text>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    },
    Image: {
        width: 80,
        height: 80
    },
    Text: {
        color: 'white',
        fontWeight: 'bold',
        backgroundColor: 'transparent',
        marginTop: 20
    }
})