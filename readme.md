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