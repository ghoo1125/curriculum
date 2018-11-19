//
// This file is generated by parsec-rdl-gen (development version)
// WILL NOT be auto-generated if file has already existed.
//
package yahoo.ec;

import yahoo.ec.parsec_generated.Student;
import yahoo.ec.parsec_generated.ResourceContext;
import yahoo.ec.parsec_generated.CurriculumHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * CurriculumHandlerImpl is interface implementation that implement CurriculumHandler interface.
 */
public class CurriculumHandlerImpl implements CurriculumHandler {

    @Override
    public Student getStudentsById(ResourceContext context, Integer id) {
        Student student = new Student();
        student.setName("ghoo");
        return student;
    }

    @Override
    public ResourceContext newResourceContext(HttpServletRequest request, HttpServletResponse response) {
        return new DefaultResourceContext(request, response);
    }
}