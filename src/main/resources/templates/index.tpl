yieldUnescaped '<!DOCTYPE html>'

html(lang:'ja') {
    head {
        meta(charset:'utf-8')
        title(title)
        link(rel:"stylesheet", type:"text/css", href:"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css")
    }

    body {
        h1(class:"display-4", title)
        p(msg)
    }
}