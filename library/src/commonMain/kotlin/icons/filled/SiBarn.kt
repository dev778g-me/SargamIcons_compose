package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBarn: ImageVector
    get() {
        if (_SiBarn != null) {
            return _SiBarn!!
        }
        _SiBarn = ImageVector.Builder(
            name = "Filled.SiBarn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.69f, 3.418f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.58f, 0f)
                lineToRelative(10.279f, 6.746f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.098f, 1.672f)
                lineTo(21f, 10.884f)
                verticalLineToRelative(7.704f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.6f, 21f)
                lineTo(5.4f, 21f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.588f)
                lineTo(3f, 10.88f)
                lineToRelative(-1.45f, 0.955f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.1f, -1.67f)
                close()
                moveTo(7.95f, 20f)
                horizontalLineToRelative(8.1f)
                lineTo(12f, 18.312f)
                close()
                moveTo(6f, 19.188f)
                lineToRelative(4.05f, -1.688f)
                lineTo(6f, 15.812f)
                close()
                moveTo(13.95f, 17.5f)
                lineTo(18f, 19.188f)
                verticalLineToRelative(-3.376f)
                close()
                moveTo(12f, 16.688f)
                lineTo(16.05f, 15f)
                horizontalLineToRelative(-8.1f)
                close()
                moveTo(11f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.build()

        return _SiBarn!!
    }

@Suppress("ObjectPropertyName")
private var _SiBarn: ImageVector? = null
