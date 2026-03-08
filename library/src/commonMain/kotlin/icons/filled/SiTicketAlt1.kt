package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiTicketAlt1: ImageVector
    get() {
        if (_SiTicketAlt1 != null) {
            return _SiTicketAlt1!!
        }
        _SiTicketAlt1 = ImageVector.Builder(
            name = "Filled.SiTicketAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.8f, 4f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6.2f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2.8f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, 2.2f)
                horizontalLineTo(3.2f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 17.8f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(6.2f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 4f)
                close()
                moveTo(8f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _SiTicketAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiTicketAlt1: ImageVector? = null
