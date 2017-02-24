public class Builder3 implements IBuilder {

	@Override
	public MrPotatoHead makePotatoHead() 
	{
        return new MrPotatoHead(22, 12, new AngleHead(),
                new BigEyes(), new SimpleNose(), new Happy());
	}

}
