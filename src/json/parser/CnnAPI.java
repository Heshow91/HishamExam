package json.parser;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api
      API_KEY = 78dcd6aafff94700a460371d31af7774

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY


      //MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f
      */

    /*{
        "status": "ok",
            "totalResults": 10,
            "articles": [{
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": null,
                "title": "'The Education of Brett Kavanaugh' authors Kate Kelly and Robin Pogrebin explain NYT tweet that caused backlash over wording - CNN Video",
                "description": "Kate Kelly and Robin Pogrebin, authors of new book \"The Education of Brett Kavanaugh,\" explain the thought process behind a tweet the New York Times Opinion desk published promoting their article. The Times has since apologized for the \"offensive\" tweet.",
                "url": "http://us.cnn.com/videos/media/2019/09/17/brett-kavanaugh-kate-kelly-robin-pogrebin-new-allegations-nyt-tweet-newday-vpx.cnn",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190917111905-02-kate-kelly-robin-pogrebin-newday-kavanaugh-super-tease.jpg",
                "publishedAt": "2019-09-17T15:38:17.5954753Z",
                "content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": null,
                "title": "Yale graduate and former Wallstreet banker is now homeless in California - CNN Video",
                "description": "CNN's Dan Simon speaks with Shawn Pleasants, a Yale graduate and former Wallstreet banker and entrepreneur who is now one of quarter of the country's homeless population living in California.",
                "url": "http://us.cnn.com/videos/us/2019/09/17/california-homelessness-crisis-yale-graduate-shawn-pleasants-simons-dnt-newday-vpx.cnn",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190916163812-05-shawn-pleasants-super-tease.jpg",
                "publishedAt": "2019-09-17T14:52:43.5083641Z",
                "content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": null,
                "title": "Streets full of tents: The other side of L.A. - CNN Video",
                "description": "In one of America's largest city, Los Angeles, homelessness has increased by 16%. Maeve Reston reports on what's being done to tackle this growing epidemic.",
                "url": "http://us.cnn.com/videos/politics/2019/06/13/homelessness-in-la-orig-vstan-jm.cnn",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190606095540-06-la-homelessness-super-tease.jpg",
                "publishedAt": "2019-09-17T14:23:52.7729594Z",
                "content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": "Dan Simon, CNN",
                "title": "He was a Yale graduate, Wall Street banker and entrepreneur. Today he's homeless in Los Angeles",
                "description": "Shawn Pleasants has the kind of resume that would attract the attention of any job recruiter: high school valedictorian, economics major from Yale University, Wall Street banking jobs, small business entrepreneur. But a few wrong turns in life 10 years ago le…",
                "url": "http://us.cnn.com/2019/09/17/us/los-angeles-yale-graduate-homeless/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190916163920-02-shawn-pleasants-super-tease.jpg",
                "publishedAt": "2019-09-17T13:08:58Z",
                "content": "Los Angeles (CNN)Shawn Pleasants has the kind of resume that would attract the attention of any job recruiter: high school valedictorian, economics major from Yale University, Wall Street banking jobs, small business entrepreneur. But a few wrong turns in lif… [+8515 chars]"
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": "Oliver Darcy, CNN Business",
                "title": "New York Times' botched Kavanaugh story the latest in series of blunders from Opinion section",
                "description": "The New York Times was reeling on Monday after its Opinion section fumbled a high-profile story about an allegation of sexual misconduct against Supreme Court Justice Brett Kavanaugh, drawing widespread criticism and condemnation of the newspaper.",
                "url": "http://us.cnn.com/2019/09/16/media/new-york-times-kavanaugh/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190813165424-01-new-york-times-building-file-super-tease.jpg",
                "publishedAt": "2019-09-16T23:25:43Z",
                "content": "New York (CNN Business)The New York Times was reeling on Monday after its Opinion section fumbled a high-profile story about an allegation of sexual misconduct against Supreme Court Justice Brett Kavanaugh, drawing widespread criticism and condemnation of the… [+4493 chars]"
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": "Elie Honig",
                "title": "Rescue Kavanaugh? Trump's ridiculous idea",
                "description": "Elie Honig writes though President Trump may want to save Justice Kavanaugh's reputation, the Justice Department does not \"rescue\" people who have been repeatedly accused of sexual assault, nor should it throw its enormous power into partisan battles to settl…",
                "url": "http://us.cnn.com/2019/09/16/opinions/trump-kavanaugh-justice-department-not-rescue-honig/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180928101130-20180928-kavanaugh-opinion-illustration-super-tease.jpg",
                "publishedAt": "2019-09-16T19:17:37Z",
                "content": "In this weekly column \"Cross-exam,\" Elie Honig, a CNN legal analyst and former federal and state prosecutor, gives his take on the latest legal news. Post your questions below. The views expressed in this commentary are his own. View more opinion articles on … [+9893 chars]"
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": "Maeve Reston\nCNN Video by Jeremy Moorhead and Gabe Ramirez",
                "title": "LA's homeless crisis: too many tents, too few beds",
                "description": "In Los Angeles' Skid Row, tents line entire city blocks. These makeshift shelters for the city's homeless are now an almost permanent fixture of the city's landscape, with barbecue grills and clusters of bikes standing alongside them.",
                "url": "http://us.cnn.com/2019/06/18/politics/los-angeles-homeless-crisis/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190606095629-08-la-homelessness-super-tease.jpg",
                "publishedAt": "2019-06-18T11:03:55Z",
                "content": "(CNN)In Los Angeles' Skid Row, tents line entire city blocks. These makeshift shelters for the city's homeless are now an almost permanent fixture of the city's landscape, with barbecue grills and clusters of bikes standing alongside them.\r\nSome residents hav… [+13003 chars]"
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": "LZ Granderson",
                "title": "In LA's homelessness crisis, the Skid Row is everywhere",
                "description": "While it is fair to wonder what our elected officials are doing with our tax dollars to solve homelessness, I do wonder what our religious figures, like Christian televangelist and prosperity gospel adherent Kenneth Copeland, are doing on the issue with their…",
                "url": "http://us.cnn.com/2019/06/05/opinions/la-homeless-skid-row-churches-granderson/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190606182326-lz-granderson-super-tease.jpg",
                "publishedAt": "2019-06-06T22:26:15Z",
                "content": "LZ Granderson is a journalist and political analyst. He was a fellow at the Institute of Politics at the University of Chicago and the Hechinger Institute at Columbia University. He is the sports and culture columnist for the Los Angeles Times and co-host of … [+5021 chars]"
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": "Holly Yan, CNN",
                "title": "These are the states where homelessness has increased and decreased the most",
                "description": "Some states saw big changes in the numbers of homeless veterans and homeless families with children.",
                "url": "http://us.cnn.com/2019/06/06/us/homelessness-by-the-numbers/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190606095540-06-la-homelessness-super-tease.jpg",git config
                "publishedAt": "2019-06-06T21:19:34Z",
                "content": "(CNN)This week, Los Angeles County officials were stunned to learn the area's homeless population soared by almost 60,000 in the past year.\r\nBut statewide, California actually had the biggest overall decrease in the number of homeless people of any state from… [+2172 chars]"
    }, {
        "source": {
            "id": "cnn",
                    "name": "CNN"
        },
        "author": "Allie Torgan, CNN",
                "title": "Judge's running club helps Skid Row's homeless rebuild their lives",
                "description": "He is a 62-year-old superior court judge. They are former addicts and felons. Some of them have completed prison sentences; others have lived under bridges.",
                "url": "http://us.cnn.com/2019/04/04/us/cnnheroes-judge-craig-mitchell-skid-row-running-club/index.html",
                "urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190404143950-cnnheroes-mitchell-group-run-super-tease.jpg",
                "publishedAt": "2019-04-12T19:25:06Z",
                "content": "Know someone who inspires you? Click here to nominate them as a CNN Hero.\r\nLos Angeles (CNN)He is a 62-year-old superior court judge. They are former addicts and felons. Some of them have completed prison sentences; others have lived under bridges. \r\nAll of t… [+5541 chars]"
    }]
    }

     */
/*
        /*
	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

}
