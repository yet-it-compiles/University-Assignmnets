import * as React from 'react';

const welcomeInformation = {
    greeting: "Hello Hacker!",
    introMessage: "This is my first React development module"
};

const listToIterateThrough = [
    {
        title: 'React',
        url: 'https://reactjs.org/',
        author: ' Jordan Walke ',
        num_comments: 3,
        points: 4,
        objectID: 0,
    },
    {
        title: 'Redux',
        url: 'https://redux.js.org/',
        author: ' Dan Abramov , Andrew Clark ',
        num_comments: 2,
        points: 5,
        objectID: 1,
    },
];

const App = () => {
    return (
        <div>
            <h1>{welcomeInformation.greeting}</h1>
            <p>{welcomeInformation.introMessage}</p>

            <Search/>

            <hr/>

            <List/>

            <List/>
        </div>
    );
}

const Search = () => {
    return (
        <div>
            <label htmlFor="search">Search: </label>
            <input id="search" type="text"/>
        </div>
    );
}

const List = () => {
    return (
        <ul>
            {listToIterateThrough.map(function (item) {
                return (
                    <li key={item.objectID}>
                        <span>
                        <a href={item.url}>{item.title}</a>
                        </span>
                        <span>{item.author}</span>
                        <span>{item.num_comments}</span>
                        <span>{item.points}</span>
                    </li>
                );
            })}
        </ul>
    )
}


export default App;
