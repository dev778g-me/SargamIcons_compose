package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiTicket: ImageVector
    get() {
        if (_SiTicket != null) {
            return _SiTicket!!
        }
        _SiTicket = ImageVector.Builder(
            name = "Regular.SiTicket",
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
                moveTo(2f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
                verticalLineTo(6.2f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 5f)
                horizontalLineToRelative(17.6f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6.2f)
                verticalLineTo(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6f)
                verticalLineToRelative(2.8f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, 1.2f)
                horizontalLineTo(3.2f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17.8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 15f)
                verticalLineTo(9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()

        return _SiTicket!!
    }

@Suppress("ObjectPropertyName")
private var _SiTicket: ImageVector? = null
