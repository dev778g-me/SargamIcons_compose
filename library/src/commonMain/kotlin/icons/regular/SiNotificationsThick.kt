package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiNotificationsThick: ImageVector
    get() {
        if (_SiNotificationsThick != null) {
            return _SiNotificationsThick!!
        }
        _SiNotificationsThick = ImageVector.Builder(
            name = "Regular.SiNotificationsThick",
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
                moveTo(8f, 18f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.894f, -1.447f)
                lineTo(4f, 12.763f)
                verticalLineTo(10f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(2.764f)
                lineToRelative(1.894f, 3.789f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                horizontalLineToRelative(-5f)
                moveToRelative(-8f, 0f)
                horizontalLineToRelative(8f)
                moveToRelative(-8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
            }
        }.build()

        return _SiNotificationsThick!!
    }

@Suppress("ObjectPropertyName")
private var _SiNotificationsThick: ImageVector? = null
