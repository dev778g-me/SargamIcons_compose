package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiNotificationsAlt2: ImageVector
    get() {
        if (_SiNotificationsAlt2 != null) {
            return _SiNotificationsAlt2!!
        }
        _SiNotificationsAlt2 = ImageVector.Builder(
            name = "Regular.SiNotificationsAlt2",
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
                moveTo(15f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                moveToRelative(-2.957f, 0f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.718f, -0.95f)
                arcToRelative(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.142f, -1.972f)
                lineToRelative(0.545f, -1.212f)
                arcTo(13.5f, 13.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.882f, 9.23f)
                lineToRelative(0.031f, -0.473f)
                arcTo(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.83f, 4.666f)
                arcTo(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.998f, 3f)
                arcToRelative(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.168f, 1.666f)
                arcToRelative(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.917f, 4.09f)
                lineToRelative(0.031f, 0.474f)
                arcToRelative(13.5f, 13.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.154f, 4.636f)
                lineToRelative(0.546f, 1.211f)
                arcToRelative(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.138f, 1.976f)
                arcToRelative(2.027f, 2.027f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.723f, 0.947f)
                close()
            }
        }.build()

        return _SiNotificationsAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiNotificationsAlt2: ImageVector? = null
