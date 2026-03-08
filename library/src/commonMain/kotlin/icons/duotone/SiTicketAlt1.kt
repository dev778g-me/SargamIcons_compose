package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiTicketAlt1: ImageVector
    get() {
        if (_SiTicketAlt1 != null) {
            return _SiTicketAlt1!!
        }
        _SiTicketAlt1 = ImageVector.Builder(
            name = "Duotone.SiTicketAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(19f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
            }
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
