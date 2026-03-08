package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiTicketAlt1: ImageVector
    get() {
        if (_SiTicketAlt1 != null) {
            return _SiTicketAlt1!!
        }
        _SiTicketAlt1 = ImageVector.Builder(
            name = "Regular.SiTicketAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 5f)
                horizontalLineToRelative(11.8f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6.2f)
                verticalLineTo(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6f)
                verticalLineToRelative(2.8f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, 1.2f)
                horizontalLineTo(9f)
                moveTo(9f, 5f)
                horizontalLineTo(3.2f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6.2f)
                verticalLineTo(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 6f)
                verticalLineToRelative(2.8f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, 19f)
                horizontalLineTo(9f)
                moveTo(9f, 5f)
                verticalLineToRelative(14f)
            }
        }.build()

        return _SiTicketAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiTicketAlt1: ImageVector? = null
