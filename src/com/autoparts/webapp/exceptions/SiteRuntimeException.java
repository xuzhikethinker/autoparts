package com.autoparts.webapp.exceptions;

public class SiteRuntimeException extends RuntimeException
{
    private static final long serialVersionUID = -2983279579787275374L;

    public SiteRuntimeException()
    {
    }

    public SiteRuntimeException(final String message)
    {
        super(message);
    }

    public SiteRuntimeException(final Throwable cause)
    {
        super(cause);
    }

    public SiteRuntimeException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

}


