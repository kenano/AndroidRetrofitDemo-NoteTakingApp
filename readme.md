Refactored code to pass a string into getIdeas which will filter Ideas on a query string parameter.
    This modified getIdeas signature. 

-------------------------------------------------------------------
Defined a path request to retrieve Idea objs from remote.

Replaced sampleContent with retrofit call to remote.

-------------------------------------------------------------------

Created IdeaService which maps api call "ideas". The endpoint returns a list of entries.

Modified IdeaListActivity to use data returned from endpoint instead of sample content.


-------------------------------------------------------------------

Customized the okhttp client being used by retrofit to enable using HttpLoggingInterceptor.
    Added dependency to use HttpLoggingInterceptor.

-------------------------------------------------------------------
Add libraries for gson, rertrofit to gradle.

Create interface which defines RESTApi (MessageService).

Create a builder that will create instances of the interface.

Define response handler and call api from LandingActivity.